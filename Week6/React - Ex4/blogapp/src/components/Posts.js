import React, { Component } from 'react'

export default class Posts extends Component {
    constructor(props){
        super(props);
        this.state = {
            posts: []
        }
    }

    async loadPosts(){
        try {
            const response = await fetch("https://jsonplaceholder.typicode.com/posts");
            const data = await response.json();
            this.setState({ posts: data });
        } catch (error) {
            console.error("Failed to load posts:", error);
        }
    }

    componentDidMount() {
        this.loadPosts();
    }

    render() {
        return (
            <div>
                <h2>Posts Table</h2>
                <table border="1" cellPadding="10" style={{ borderCollapse: 'collapse', width: '100%' }}>
                    <thead>
                        <tr>
                        <th>ID</th>
                        <th>Title</th>
                        <th>Body</th>
                        </tr>
                    </thead>
                    <tbody>
                        {this.state.posts.map(post => (
                        <tr key={post.id}>
                            <td>{post.id}</td>
                            <td>{post.title}</td>
                            <td>{post.body}</td>
                        </tr>
                        ))}
                    </tbody>
                </table>
            </div>
        )
    }
}
