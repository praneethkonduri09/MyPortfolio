const toggleButton = document.getElementById('theme-toggle');
const body = document.body;

// Load saved theme from localStorage
if (localStorage.getItem('theme') === 'light') {
  body.classList.add('light');
}

toggleButton.addEventListener('click', () => {
  body.classList.toggle('light');

  // Save preference
  if (body.classList.contains('light')) {
    localStorage.setItem('theme', 'light');
  } else {
    localStorage.setItem('theme', 'dark');
  }
});
