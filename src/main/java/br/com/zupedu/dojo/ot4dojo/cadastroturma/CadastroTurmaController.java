package br.com.zupedu.dojo.ot4dojo.cadastroturma;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<?> salvar(@RequestBody @Valid CadastroTurmaRequest request){
    	
    	TurmaEntity turmaEntity = request.toModel();

    	if(repository.existsByNome(request.getNome())){
    	    return ResponseEntity.badRequest().body(new ErroResponse(request.getNome(), "o nome já existe"));
        }

    	repository.save(turmaEntity);

        return ResponseEntity.ok(request.toString());
    }

}
