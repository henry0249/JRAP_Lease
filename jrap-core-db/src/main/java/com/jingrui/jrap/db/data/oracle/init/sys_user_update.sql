UPDATE SYS_USER SU SET SU.EMPLOYEE_ID=(SELECT HE.EMPLOYEE_ID FROM HR_EMPLOYEE HE WHERE  upper(HE.EMPLOYEE_CODE)  = upper(SU.USER_NAME))