public class Sql {
    SELECT companyId as c
    from company,
    (SELECT count(userId) as users
    INNER JOIN BRANCH ON COMPANY.companyId = BRANCH.companyId
    INNER JOIN USERS ON BRANCH.branchId = USERS.branchId
    where company.companyId = c);
}
