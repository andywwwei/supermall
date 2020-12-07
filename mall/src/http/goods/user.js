import {request} from '../axios'

export function register () {
  return request({
    url: '/goods/select',
    method: 'get',
    headers: {
      'Content-Type': 'application/json;charset=UTF-8'
    }
  })
}
