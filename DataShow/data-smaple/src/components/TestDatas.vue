<template>

    <div>
        <h1>시험 일정</h1>
        <ul>
        <li v-for="item in testDates" :key="item.examstartdt">
            원서접수 시작일자: {{ item.examregstartdt }}<br>
            원서접수 종료일자: {{ item.examregenddt }}<br>
            시험 시작일자: {{ item.examstartdt }}<br>
            시험 종료일자: {{ item.examenddt }}<br>
            합격자 발표 시작일자: {{ item.passstartdt }}<br>
            합격자 발표 종료일자: {{ item.passenddt }}
        </li>
        </ul>
    </div>

</template>


<script lang="ts">

import { defineComponent, ref } from 'vue';
import axios from 'axios';

interface TestDate {
  examregstartdt: string;
  examregenddt: string;
  examstartdt: string;
  examenddt: string;
  passstartdt: string;
  passenddt: string;
}

export default defineComponent({
  name: 'TestDatas',
  setup() {
    const testDates = ref<TestDate[]>([]);

    const fetchTestDates = async () => {
      const apiUrl = 'http://openapi.q-net.or.kr/api/service/rest/InquiryTestDatesNationalProfessionalQualificationSVC/getList';
      const apiKey = 'R%2B495AT%2BHZNdQ9n0YuGnSAnZ0ljQXH1R4sW9GZeVF5ni7QYn%2BMf8aP%2Frv%2BjrfqqsA2L26l6Asr4uBam76oBQ6Q%3D%3D';

      try {
        const response = await axios.get(apiUrl, {
          params: {
            seriesCd: 'yourSeriesCdValue',  // 실제 값으로 대체
            ServiceKey: apiKey
          }
        });
        testDates.value = response.data; // 데이터 구조에 따라 조정 필요
      } catch (error) {
        console.error('Error fetching data:', error);
      }
    };

    fetchTestDates();

    return {
      testDates
    };
  }
});
</script>
