package br.com.zupedu.dojo.ot4dojo.cadastroturma;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/turmas")
public class CadastroTurmaController {


    @PostMapping
    public ResponseEntity<?> salvar(@RequestBody @Valid CadastroTurmaRequest request){
        return ResponseEntity.ok(request.toString());
    }

}
