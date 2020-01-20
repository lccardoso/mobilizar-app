package com.example.mobilizar.api.resource;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.mobilizar.api.model.Motorista;
import com.example.mobilizar.api.repository.MotoristaRepository;

@RestController
@RequestMapping("/motoristas")
public class MotoristaResource {
	
	@Autowired
	private MotoristaRepository motoristaRepository;
	
	@PostMapping
	public ResponseEntity<Motorista> criar (@Valid @RequestBody Motorista motorista, HttpServletResponse response) {
		Motorista motoristaSalva = motoristaRepository.save(motorista);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri().path("/{codigo}")
				.buildAndExpand(motoristaSalva.getCodigo()).toUri();
		response.setHeader("Location", uri.toASCIIString());
		
		return ResponseEntity.created(uri).body(motoristaSalva);
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Motorista> buscaPeloCodigo(@PathVariable Long codigo){
		Motorista motorista = motoristaRepository.findOne(codigo);
		return motorista != null ? ResponseEntity.ok(motorista) : ResponseEntity.notFound().build();
	}

}
