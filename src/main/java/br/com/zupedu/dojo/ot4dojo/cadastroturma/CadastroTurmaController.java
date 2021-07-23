package br.com.zupedu.dojo.ot4dojo.cadastroturma;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;

import javax.transaction.Transactional;
import javax.validation.Valid;

@RestController
@RequestMapping("/turmas")
public class CadastroTurmaController {

	@Autowired
	private TurmaRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity<?> salvar(@RequestBody @Valid CadastroTurmaRequest request, UriComponentsBuilder uri){
    	
    	TurmaEntity turmaEntity = request.toModel();

    	if(repository.existsByNome(request.getNome())){
    	    return ResponseEntity.badRequest().body(new ErroResponse(request.getNome(), "o nome já existe"));
        }

    	repository.save(turmaEntity);

        
        UriBuilder uriBuilder = uriBuilder.path("/turmas/{id}").buildAndExpand(turmaEntity.getId()).toUri();

	    return ResponseEntity.created(uri).body(new TurmaResponse(turmaEntity));	
        
    }

}
