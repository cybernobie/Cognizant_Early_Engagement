document.addEventListener('DOMContentLoaded', function () {
    const deleteButtons = document.querySelectorAll('.btn-delete-expense');

    deleteButtons.forEach(button => {
        button.addEventListener('click', function (event) {
            event.preventDefault(); // Prevent default link behavior

            const expenseId = this.getAttribute('data-id');
            const listItem = this.closest('tr'); // Get the table row

            if (confirm('Are you sure you want to delete this expense?')) {
                fetch(`/api/expenses/${expenseId}`, {
                    method: 'DELETE',
                })
                .then(response => {
                    if (response.ok) {
                        // Remove the expense item from the page
                        if (listItem) {
                            listItem.remove();
                        }
                        // Optionally, update the total expenses display
                        // This might require another AJAX call or recalculating on the client side
                        // For simplicity, we'll just reload or let the server recalculate on next page load.
                        // For a more dynamic update, you would fetch the new total and update the DOM.
                        alert('Expense deleted successfully!');
                        window.location.reload(); // Reload to update total and list
                    } else {
                        // Handle errors
                        response.json().then(data => {
                            alert('Error deleting expense: ' + (data.message || response.statusText));
                        }).catch(() => {
                            alert('Error deleting expense: ' + response.statusText);
                        });
                    }
                })
                .catch(error => {
                    console.error('Error:', error);
                    alert('An error occurred while deleting the expense.');
                });
            }
        });
    });
});
