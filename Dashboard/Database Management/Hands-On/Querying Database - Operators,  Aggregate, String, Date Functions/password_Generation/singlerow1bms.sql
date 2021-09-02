select name, concat(substr(NAME,1,3), substr(PHNO,1,3)) as password 
from users 
order by NAME;
