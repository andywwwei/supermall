<template>
  <div>
    <h1>我是中国人</h1>
    <h2>我是中国人</h2>
    <h3>{{goodsName}}</h3>
  </div>
</template>
<script>
  import {register} from '../http/goods/user'
  export default {
    name: 'Hello',
    data () {
      return {
        goodsName: ''
      }
    },
    created () {
      this.login();
    },
    methods: {
      login() {
        // this.$axios.get('http://localhost:8080/goods/select').then(res => {
        //   console.log(res);
        // })
        register().then(res => {
          this.goodsName = res.data;
        });
      }
    }
  }
</script>
