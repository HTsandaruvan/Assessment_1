let url = 'https://jsonplaceholder.typicode.com/users'

fetch(url)
    .then(response => response.json())
    .then(data => {
        const userList = document.getElementById('user-list');
        // const name = document.getElementById('name')
        // const email = document.getElementById('email')
        // const address = document.get
        data.forEach(user => {
            const userDiv = document.createElement('div');
            userDiv.classList.add('user');
            userDiv.innerHTML = `
            <h3>${user.name}</h3>
            <p>Email: ${user.email}</p>
            <p>Address: ${user.address.street}, ${user.address.city}</p>
        `;
            userList.appendChild(userDiv);
        });
    })
    .catch(error => {
        console.error('Error fetching data:', error);
    });