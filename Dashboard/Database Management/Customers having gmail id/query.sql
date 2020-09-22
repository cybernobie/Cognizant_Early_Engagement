select customer_id, customer_name, address, phone_no
from customers
where email_id like "%gmail%"
order by customer_id;