import logo from './logo.svg';
import './App.css';

function App() {
  const courses = [
    {name: "Angular", date: "4/5/2021"},
    {name: "React", date: '6/5/2021'}
  ];
  const books = [
    {name: "Master React", pages: 670},
    {name: "Deep dive into Angular 11", pages: 800},
    {name: "Mongo Essentials", pages: 450}
  ]
  const blogs = [
    {name: "React Learning", author: "Stephen Biz", description: "Welcome to learning React"},
    {name: "Installation", author: "Schewzdeneir", description: "You can install React from npm"}
  ]
  return (
    <div>
      <div className="App">
        <div>
          <h1>Course Details</h1>
          <div>
            {courses.map((course) => {
              return (
                <div>
                  <h1>{course.name}</h1>
                  <h3>{course.date}</h3>
                </div>
              )
            })}
          </div>
        </div>

        <div>
          <h1>Book Details</h1>
          <div>
            {books.map((book) => {
              return (
                <div>
                  <h1>{book.name}</h1>
                  <h3>{book.pages}</h3>
              </div>
              )
            })}
          </div>
        </div>

        <div>
          <h1>Blog Details</h1>
          <div>
            {blogs.map((blog) => {
              return (
                <div>
                  <h1>{blog.name}</h1>
                  <h3><strong>{blog.author}</strong></h3>
                  <h3>{blog.description}</h3>
                </div>
              );
            })}

          </div>
        </div>
      </div>
    </div>
  );
}

export default App;
