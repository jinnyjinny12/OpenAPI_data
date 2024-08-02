package com.ohgiraffers.dataexample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class Controller {

    private final RestTemplate restTemplate;

    @Value("${api.key}")
    private String apiKey;

    public Controller(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    @GetMapping("/api/data")
//    public String getData() {
//        return "Hello World";
//    }

    @GetMapping("/api/data")
    public String getData() {
//        String apiKey = "R%2B495AT%2BHZNdQ9n0YuGnSAnZ0ljQXH1R4sW9GZeVF5ni7QYn%2BMf8aP%2Frv%2BjrfqqsA2L26l6Asr4uBam76oBQ6Q%3D%3D";
//        String url = "http://openapi.q-net.or.kr/api/service/rest/InquiryTestDatesNationalProfessionalQualificationSVC?_wadl&_type=xml" + apiKey;
//        RestTemplate restTemplate = new RestTemplate();
//        return restTemplate.getForObject(url, String.class);

        // API 인증키
        String apiKey = "R%2B495AT%2BHZNdQ9n0YuGnSAnZ0ljQXH1R4sW9GZeVF5ni7QYn%2BMf8aP%2Frv%2BjrfqqsA2L26l6Asr4uBam76oBQ6Q%3D%3D";

        // 요청할 URL에 인증키 포함
        String url = "http://openapi.q-net.or.kr/api/service/rest/InquiryTestDatesNationalProfessionalQualificationSVC?_wadl&_type=xml&ServiceKey=" + apiKey;

        // RestTemplate 객체 생성
        RestTemplate restTemplate = new RestTemplate();

        // API 요청 및 응답 반환
        return restTemplate.getForObject(url, String.class);


    }



}
