<template>

 <h1> 시험일정</h1>
   <ul v-if="testDates.length">
  <li v-for="item in testDates" :key="item.examstartdt">
    원서접수 시작일자: {{ item.examregstartdt }}<br>
    원서접수 종료일자: {{ item.examregenddt }}<br>
    시험 시작일자: {{ item.examstartdt }}<br>
    시험 종료일자: {{ item.examenddt }}<br>
    합격자 발표 시작일자: {{ item.passstartdt }}<br>
    합격자 발표 종료일자: {{ item.passenddt }}
  </li>
</ul>
<p v-else>데이터를 불러오는 중입니다...</p>
</template>

<script>
import axios from 'axios';

export default {
  data() {
    return {
      testDates: []
    };
  },
  mounted() {
    this.fetchTestDates();
  },
  methods: {
    fetchTestDates() {
      axios.get('/service/rest/InquiryTestDatesNationalProfessionalQualificationSVC/getList', {
        params: {
          seriesCd: 'yourSeriesCdValue',
          ServiceKey: 'R%2B495AT%2BHZNdQ9n0YuGnSAnZ0ljQXH1R4sW9GZeVF5ni7QYn%2BMf8aP%2Frv%2BjrfqqsA2L26l6Asr4uBam76oBQ6Q%3D%3D'
        }
      })
      .then(response => {
        this.testDates = response.data;  // JSON 구조에 맞게 조정 필요
        console.log(response.data);
      })
      .catch(error => {
        console.error('Error fetching data:', error);
      });
    }
  }
};
</script>
