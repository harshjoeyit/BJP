var express = require('express');
var router = express.Router();

// using helpers 
var helpers = require('../helpers/todos');

router.route('/')
      .get(helpers.getTodos)
      .post(helpers.createTodos)

router.route('/:todoId')
      .get(helpers.getTodo)
      .put(helpers.updateTodo)
      .delete(helpers.deleteTodo)

// exporting 
module.exports = router;