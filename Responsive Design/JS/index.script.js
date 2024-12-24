// Toggle the menu visibility when the hamburger icon is clicked
const toggleIcon = document.getElementById('toggle-icon');
const navLinks = document.querySelector('.nav-links');

toggleIcon.addEventListener('click', () => {
    navLinks.classList.toggle('active');
});
