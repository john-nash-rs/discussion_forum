const express = require('express')
const router = express.Router()

router.get('/boy',(req,res) => {
    return res.json("route1")
})

router.get('/:name',(req,res) => {
    console.log(req.params.name)
    return res.json(req.params.name)
})

router.post("",(req,res)=>{
    return res.json("route3")
})

module.exports = router;