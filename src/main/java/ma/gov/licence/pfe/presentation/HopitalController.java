package ma.gov.licence.pfe.presentation;

import ma.gov.licence.pfe.dtos.HopitalDto;
import ma.gov.licence.pfe.services.IHopitalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hopital")
public class HopitalController {
    private final Logger LOGGER = LoggerFactory.getLogger(HopitalController.class);

    private final IHopitalService service;

    public HopitalController(IHopitalService service) {
        this.service = service;
    }

    @PostMapping
    public HopitalDto create(@RequestBody HopitalDto hopitalDto) {
        LOGGER.debug(" request create hopital : {} ", hopitalDto);
        return service.create(hopitalDto);
    }


}
