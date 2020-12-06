module.exports = {
  // 设置代理
  devServer: {
    proxy: {
      '/test': {
        target: 'http://localhost:8080/',
        ws: true,
        changeOrigin: true,
        pathRewrite: {
          '^/': ''
        }
      },
      '/': {
        target: 'http://localhost:8080/',
        ws: true,
        changeOrigin: true,
        pathRewrite: {
          '^/': ''
        }
      },
      '': {
        target: 'http://localhost:8080/',
        ws: true,
        changeOrigin: true,
        pathRewrite: {
          '^/': ''
        }
      },
    }
  }
}
