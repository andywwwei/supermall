<template>
  <div>
    <h1>我是中国人</h1>
    <h2>我是中国人</h2>
    <span v-for="item in student">
      <h3>{{item.id}}-{{item.name}}-{{item.age}}</h3>
      <el-button type="primary" @click="clickButton">点击</el-button>
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
      register().then(res => {
        this.student = res.data
      })
    },
    clickButton() {
      this.$router.push('/view/menu/navmenu')
    }
  }
}
</script>
