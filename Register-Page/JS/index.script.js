function validateForm() {
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('confirmPassword').value;
    const errorMessages = [];

    // Validate email format
    const emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    if (!email.match(emailPattern)) {
        errorMessages.push('Please enter a valid email address.');
    }

    // Validate password length
    if (password.length < 8) {
        errorMessages.push('Password must be at least 8 characters long.');
    }

    // Validate passwords match
    if (password !== confirmPassword) {
        errorMessages.push('Passwords do not match.');
    }

    // Display error messages or allow form submission
    const errorMessagesDiv = document.getElementById('errorMessages');
    errorMessagesDiv.innerHTML = errorMessages.join('<br>');

    if (errorMessages.length > 0) {
        return false; // Prevent form submission
    }

    return true; // Allow form submission
}