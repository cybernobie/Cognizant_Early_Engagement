select distinct u.name, u.address from users u
join bookingdetails b on b.user_id = u.user_id
where u.user_id not in 
( select user_id from bookingdetails where name='HDFC')
order by u.name;