<template>
    <div>

    <h1>구직 공고 목록</h1>
    <ul v-if="jobs.length">
      <li v-for="(job, index) in jobs" :key="index">
        <h2>{{ job.Jo_SJ }}</h2>
        <p><strong>회사명:</strong> {{ job.CMPNY_NM }}</p>
        <p><strong>근무지:</strong> {{ job.GUI_LN }}</p>
        <p><strong>시급:</strong> {{ job.HOPE_WAGE }}</p>
        <p><strong>근무시간:</strong> {{ job.WORK_TIME_NM }}</p>
        <p><strong>마감일:</strong> {{ job.RCEPT_CLOS_NM }}</p>
        <p><strong>담당자:</strong> {{ job.MNGR_NM }}</p>
        <p><strong>연락처:</strong> {{ job.MNGR_PHON_NO }}</p>

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
      jobs: [],
      error: null
    };
  },
  mounted() {
    this.fetchJobs();
  },
  methods: {
    async fetchJobs () {
      try {
        const response = await axios.get('http://localhost:8080/api/jobinfo');
        this.jobs = response.data.GetJobInfo.row;

      } catch (error) {
        this.error = '데이터를 가져오는 데 실패했습니다.';
        console.error('데이터를 가져오는 데 실패했습니다.', error);

      }
    }
  }
 
}

</script>

<style scoped>
/* 공고 목록을 더 보기 좋게 만드는 스타일 추가 */
h1 {
  font-size: 24px;
  margin-bottom: 20px;
}

ul {
  list-style-type: none;
  padding: 0;
}

li {
  border: 1px solid #ddd;
  margin-bottom: 10px;
  padding: 10px;
}

p {
  margin: 5px 0;
}

strong {
  font-weight: bold;
}
</style>