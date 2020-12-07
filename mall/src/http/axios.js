import axios from 'axios'

//  Vue.prototype.$http = axios
export function request (config) {
  //  创建axios实例
  const instance = axios.create({
    baseURL: '',
    timeout: 2000
  })
  //  发送真正的网络请求
  return instance(config)  // return的是一个promise
}
