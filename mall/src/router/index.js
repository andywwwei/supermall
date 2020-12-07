import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import Hello from '@/view/Hello'
import NavMenu from '../view/menu/NavMenu'

Vue.use(Router)
// 路由配置
export default new Router({
  routes: [
    {
      path: '/helloWorld',
      name: 'HelloWorld',
      component: HelloWorld
    },
    {
      path: '/',
      name: 'Hello',
      component: Hello
    },
    {
      path: '/view/menu/navmenu',
      name: 'NavMenu',
      component: NavMenu
    }
  ]
})
