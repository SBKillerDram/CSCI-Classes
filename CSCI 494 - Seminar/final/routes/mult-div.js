var express = require('express');
var router = express.Router();
var slug = require('slug');
var random = require('faker');



/* GET users listing. */
router.get('/', function (req, res, next) {
    res.render('mult-div', {title: 'Multiplication and Divition' });
});

module.exports = router;
