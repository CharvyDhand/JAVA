<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Attendance</title>
    <style>
        body { font-family: Arial; background:#f0f2f5; display:flex; justify-content:center; align-items:center; height:100vh;}
        .attendance-form { background:#fff; padding:30px; border-radius:8px; box-shadow:0 2px 10px rgba(0,0,0,0.1);}
        input, select { width:100%; padding:10px; margin:10px 0; border-radius:5px; border:1px solid #ccc; }
        input[type="submit"] { background:#28a745; color:#fff; border:none; cursor:pointer; }
        input[type="submit"]:hover { background:#218838; }
    </style>
</head>
<body>
<div class="attendance-form">
    <h2>Mark Attendance</h2>
    <form action="AttendanceServlet" method="post">
        <input type="text" name="studentId" placeholder="Student ID" required />
        <input type="date" name="attendanceDate" required />
        <select name="status" required>
            <option value="">--Select Status--</option>
            <option value="Present">Present</option>
            <option value="Absent">Absent</option>
        </select>
        <input type="submit" value="Submit Attendance" />
    </form>
</div>
</body>
</html>
