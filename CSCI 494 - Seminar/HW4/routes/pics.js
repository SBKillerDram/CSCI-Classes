var express = require('express');
var router = express.Router();
var slug = require('slug');
var random = require('faker');



/* GET users listing. */
function renderpics(req, res, next) {
    //var data = generatedData; //See Bottom
    var data = generateBlogPosts();
    res.render('pics', {title: 'Pictures', data:data });
}

router.get('/', renderpics);

router.get('/index.html', renderpics);

module.exports = router;

//Private Methods

function generateBlogPosts() {
    var list = [];
    var stop = 20;
    var item = {};
    for (var i = 0; i < stop; i++) {
        item = generate_picture_item(i+1);
        list.push(item);
    }
    return list;
}
var loremWords = ["lorem", "ipsum", "dolor", "sit", "amet", "consectetur", "adipisicing", "elit,", "sed", "do"];

function generate_picture_item(index) {
    var words = 10;
    var item = {};

    item.type = "picture";
    var text = "";
    for (var i = 0; i < words; i++)
        text += getRandomWord();
    item.content = text;
    item.datePublished = random.date.recent();
    var url = "/images/pics/Photo";
    if(index > 4)
        index -= 4;
    url += "-"+index+".jpg";
    item.imgUrl = url;
    return item;
}

function getRandomWord() {
    return loremWords[Math.floor((Math.random() * 10))] + " ";
}
