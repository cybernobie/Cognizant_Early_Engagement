select customer_id, customer_name, ifnull(address, ifnull(email_id, "NA")) as contact_details
from customes
order by customer_id;