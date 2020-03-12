package com.tdp.ms.recruitmentservice.expose;

import com.tdp.ms.recruitmentservice.business.RecruitmentserviceService;
import com.tdp.ms.recruitmentservice.model.RecruitmentserviceRequest;
import com.tdp.ms.recruitmentservice.model.RecruitmentserviceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * Class: RecruitmentserviceController. <br/>
 * <b>Copyright</b>: &copy; 2019 Telef&oacute;nica del Per&uacute;<br/>
 * <b>Company</b>: Telef&oacute;nica del Per&uacute;<br/>
 *
 * @author Telef&oacute;nica del Per&uacute; (TDP) <br/>
 *         <u>Service Provider</u>: Everis Per&uacute; SAC (EVE) <br/>
 *         <u>Developed by</u>: <br/>
 *         <ul>
 *         <li>Developer name</li>
 *         </ul>
 *         <u>Changes</u>:<br/>
 *         <ul>
 *         <li>YYYY-MM-DD Creaci&oacute;n del proyecto.</li>
 *         </ul>
 * @version 1.0
 */
@RestController
@RequestMapping("/recruitmentservice/v1/greeting")
public class RecruitmentserviceController {

    @Autowired
    private RecruitmentserviceService recruitmentserviceService;

    @GetMapping
    public Mono<RecruitmentserviceResponse> indexGet() {
        return Mono.justOrEmpty(recruitmentserviceService.get());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<RecruitmentserviceResponse> indexPost(@RequestBody RecruitmentserviceRequest request) {
        return Mono.justOrEmpty(recruitmentserviceService.put(request.getName()));
    }

}