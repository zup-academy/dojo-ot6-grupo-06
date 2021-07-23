package br.com.zupedu.dojo.ot4dojo.cadastroturma;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

@RestController
@RequestMapping("/turmas")
public class CadastroTurmaController {

	@Autowired
	private TurmaRepository repository;
	
	
	
    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody @Valid CadastroTurmaRequest request){
    	
    	TurmaEntity turmaEntity = request.toModel();
    	
    	
    	List<TurmaEntity> listaTurma= repository.findAll();
    	listaTurma.stream().anyMatch(turma->{
    		
    	})
    	
    	
        return ResponseEntity.ok(request.toString());
    }

}
