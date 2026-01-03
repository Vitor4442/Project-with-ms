package com.VTRLABS.hrpayroll.services;

import com.VTRLABS.hrpayroll.entities.Payment;
import com.VTRLABS.hrpayroll.entities.Worker;
import com.VTRLABS.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(Long workerId, int days){

        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
