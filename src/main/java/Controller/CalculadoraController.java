package Controller;

import com.example.atividade_deploy.Service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadoraController {
    private final CalculadoraService calucladoraService;

    public CalculadoraController(CalculadoraService calucladoraService){
        this.calucladoraService = calucladoraService;
    }
    @PostMapping("divisão/{a}/{b}")
    public ResponseEntity<Double> divisao(@PathVariable double a, @PathVariable double b) {
        return ResponseEntity.ok(calucladoraService.dividir(a,b));
    }
}
