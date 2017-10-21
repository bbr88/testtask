public class Sql {
    SELECT companyName, count(userId) as users
    FROM COMPANY
    INNER JOIN BRANCH ON COMPANY.companyId = BRANCH.companyId
    INNER JOIN USERS ON BRANCH.branchId = USERS.branchId;
}
