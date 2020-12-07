<template>
  <div>
    <h1>我是中国人</h1>
    <h2>我是中国人</h2>
    <span v-for="item in student" >
      <h3>{{item.id}}-{{item.name}}-{{item.age}}</h3>
    </span>
  </div>
</template>
<script>
import {register} from '../http/goods/user'
export default {
  name: 'Hello',
  data () {
    return {
      student: []
    }
  },
  created () {
    this.login()
  },
  methods: {
    login () {
      // this.$axios.get('http://localhost:8080/goods/select').then(res => {
      //   console.log(res);
      // })
      register().then(res => {
        this.student = res.data
      })
    }
  }
}
</script>
