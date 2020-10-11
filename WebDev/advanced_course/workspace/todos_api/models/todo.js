const mongoose = require('mongoose');

var todoSchema = new mongoose.Schema({
      name: {
            type: String,
            required: 'Name cannot be Blank!'
      },
      completed: {
            type: Boolean,
            default: false
      },
      created_date: {
            type: Date, 
            default: Date.now
      }
});

// naming the model
var Todo = mongoose.model('Todo', todoSchema);

module.exports = Todo;