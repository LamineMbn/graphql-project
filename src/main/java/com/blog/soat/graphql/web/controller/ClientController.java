package com.blog.soat.graphql.web.controller;

import com.blog.soat.graphql.dto.ClientDto;
import com.blog.soat.graphql.entities.Client;
import com.blog.soat.graphql.mapper.ClientMapper;
import com.blog.soat.graphql.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(path = "/clients")
public class ClientController {

	@Autowired
	ClientRepository clientRepository;

	@GetMapping
	public List<ClientDto> getAllSoatien() {
		List<Client> clients = (List<Client>) clientRepository.findAll();
		return clients.stream().map(client -> ClientMapper.INSTANCE.clientToClientDto(client)).collect(Collectors.toList());
	}
}
