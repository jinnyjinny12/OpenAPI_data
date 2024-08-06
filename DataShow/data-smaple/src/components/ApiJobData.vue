<template>
    <div>

    <h1>구직 공고 목록</h1>
    <ul>
      <li v-for="(job, index) in jobs" :key="index">
        <h2>{{ job.jobTitle }}</h2>
        <p><strong>회사명:</strong> {{ job.companyName }}</p>
        <p><strong>근무지:</strong> {{ job.location }}</p>
        <p><strong>시급:</strong> {{ job.wage }}</p>
        <p><strong>근무시간:</strong> {{ job.workTime }}</p>
        <p><strong>마감일:</strong> {{ job.applicationDeadline }}</p>
        <p><strong>면접 방법:</strong> {{ job.interviewMethod }}</p>
        <p><strong>담당자:</strong> {{ job.managerName }}</p>
        <p><strong>연락처:</strong> {{ job.managerPhone }}</p>
      </li>
    </ul>
    </div>

</template>


<script>
import axios from 'axios';

export default {
  name: 'ApiJobData',
  data() {
    return {
      jobs: []
    };
  },
  mounted() {
    axios.get('http://localhost:8080/api/jobinfo')
      .then(response => {
        // 변환된 JSON 데이터의 구조를 파악하여 적절히 처리합니다.
        this.jobs = response.data.jobInfo; // JSON 데이터에서 실제로 원하는 데이터 구조를 확인하여 수정 필요
      })
      .catch(error => {
        console.error('데이터를 가져오는 데 실패했습니다.', error);
      });
  }
}

</script>


<style scoped>
h1 {
  font-size: 24px;
  margin-bottom: 20px;
}
h2 {
  font-size: 18px;
}
p {
  margin: 5px 0;
}
</style>