const express = require('express')
const app = express()
const port = 3000
const notification = require("./route/notification.route.js")

app.use('/v1/notification',notification);

app.listen(port, ()=>{
    console.log('server listening on port ',port)
})