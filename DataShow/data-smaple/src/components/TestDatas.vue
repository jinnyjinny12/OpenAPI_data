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

  // testDates 를 비우기 위해 초기화시킴
  data() {
    return {
      testDates: []
    };
  },
  mounted() {
    this.fetchTestDates();
  },
  methods: { 
    // 서버에 get 요청을 보냄
    // seriesCd 라는 파라미터 포함

    fetchTestDates() {
      axios.get('/api/data', {
        params: {
          seriesCd: '21' // 테스트
        }
      }) // 성공하면 응답 데이터 처리
      .then(response => {
        this.testDates = response.data.response.body.items.item;  // JSON 구조에 맞게 조정 필요
        
      })
      .catch(error => {
        console.error('Error fetching data:', error);
      });
    }
  }
};
</script>
