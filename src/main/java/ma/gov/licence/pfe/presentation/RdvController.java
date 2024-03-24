package ma.gov.licence.pfe.presentation;

import ma.gov.licence.pfe.dtos.RdvRequestDto;
import ma.gov.licence.pfe.dtos.RdvResponseDto;
import ma.gov.licence.pfe.services.IRdvService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rdv")
public class RdvController {

    private final IRdvService service;

    public RdvController(IRdvService service) {
        this.service = service;
    }
    @PostMapping
   public RdvResponseDto create(@RequestBody RdvRequestDto requestDto)
    {
        return service.create(requestDto);
    }
    @PutMapping
    public RdvResponseDto update(@RequestBody RdvRequestDto requestDto){
        return service.update(requestDto);
    }
    @DeleteMapping("/{id-rdv}")
    public void delete(@PathVariable("id-rdv") Long id){
         service.delete(id);
    }
    @GetMapping
    public List<RdvResponseDto> findAll(){
        return service.findAll();
    }
}
