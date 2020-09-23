select distinct owner_id, owner_name, address, phone_no
from owners
where owner_id in (select distinct owner_id from cars where car_name like "Maruthi%");