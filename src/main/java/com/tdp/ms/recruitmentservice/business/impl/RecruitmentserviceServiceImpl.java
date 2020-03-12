package com.tdp.ms.recruitmentservice.business.impl;

import com.tdp.ms.recruitmentservice.business.RecruitmentserviceService;
import com.tdp.ms.recruitmentservice.model.RecruitmentserviceResponse;
import org.springframework.stereotype.Service;

/**
 * Class: RecruitmentserviceServiceImpl. <br/>
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
@Service
public class RecruitmentserviceServiceImpl implements RecruitmentserviceService {

    @Override
    public RecruitmentserviceResponse get() {
        return new RecruitmentserviceResponse("Hello world!");
    }

    @Override
    public RecruitmentserviceResponse put(String name) {
        return new RecruitmentserviceResponse(name + " created!");
    }

}