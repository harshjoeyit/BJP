
window.addEventListener('DOMContentLoaded', (event) => {
      url = "../api/todos";
      fetchData(url, displayTodos);

      var todoInput = document.querySelector('#todoInput');
      todoInput.addEventListener('keypress', function (event) {
            if (event.which == 13) {
                  createTodo(todoInput);
            }
      });
});

function checkResponse(response) {
      if (!response.ok) {
            throw Error(response.status);
      }
      return response;
}

function fetchData(query_url, responseFunction) {
      fetch(query_url)
            .then(checkResponse)
            .then(function (response) {
                  return response.json();
            })
            .then(responseFunction)
            .catch(function (error) {
                  console.log(error);
            });
}

function displayTodos(data) {
      var parent = document.querySelector('.list');
      var html_str = "";
      data.forEach(element => {
            html_str += '<li id=' + element._id + ' class="task';
            if (element.completed) {
                  html_str += ' done';
            }
            html_str += '">' + element.name + '<span>X</span></li>';
      });
      parent.innerHTML = html_str;

      addListenerToTasks();
}

function createTodo(todoInput) {
      var nameVal = todoInput.value;
      if (nameVal == "") {
            return
      }

      // POST request using fetch
      url = '../api/todos';
      data = { name: nameVal };
      fetch(url,
            {
                  method: "POST",
                  body: JSON.stringify(data),
                  headers: {
                        "Content-type": "application/json; charset=UTF-8"
                  }
            }
      )
            .then(checkResponse)
            .then(function (response) {
                  return response.json()
            })
            .then(function (data) {
                  // on success 
                  fetchData('../api/todos', displayTodos);
                  todoInput.value = "";
            })
            .catch(function (err) {
                  console.log(err)
            });
}

function addListenerToTasks() {
      var tasks = document.querySelectorAll('li.task');
      tasks.forEach(element => {
            element.addEventListener('click', function () {
                  toggleCompletion(this.id);
            });
      });

      var taskBtns = document.querySelectorAll('li.task>span');
      taskBtns.forEach(element => {
            element.addEventListener('click', function (event) {
                  event.stopPropagation();
                  // calling delet with parentElement's id
                  deleteTask(this.parentElement.id);
            });
      });
}

function toggleCompletion(id) {
      // DELETE request using fetch
      var status = true;
      var el = document.getElementById(id);
      if(el.classList.contains('done')) {
            status = false;
      }

      url = '../api/todos/' + id;
      fetch(url,
            {
                  method: "PUT",
                  body: JSON.stringify({
                        completed: status
                  }),
                  headers: {
                        "Content-type": "application/json; charset=UTF-8"
                  }
            }
      )
            .then(checkResponse)
            .then(function (response) {
                  return response.json();
            })
            .then(function (data) {
                  console.log(data);
                  fetchData('../api/todos', displayTodos);
            })
            .catch(function (err) {
                  console.log(err);
            });
}

function deleteTask(id) {

      // DELETE request using fetch
      url = '../api/todos/' + id;
      fetch(url,
            {
                  method: "DELETE",
                  headers: {
                        "Content-type": "application/json; charset=UTF-8"
                  }
            }
      )
            .then(checkResponse)
            .then(function (response) {
                  return response.json();
            })
            .then(function (data) {
                  console.log(data);
                  // removing from DOM
                  var el = document.getElementById(id);
                  el.style.display = 'none';
            })
            .catch(function (err) {
                  console.log(err);
            });
}