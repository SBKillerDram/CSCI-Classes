var express = require('express');
var router = express.Router();
var slug = require('slug');
var random = require('faker');



/* GET users listing. */
router.get('/', function (req, res, next) {
    res.render('add-sub', {title: 'Addition and Subtration' });
});

module.exports = router;
