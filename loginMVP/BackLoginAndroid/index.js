const express = require('express');
const bodyParser = require('body-parser');
const { Pool } = require('pg');

const app = express();
const PORT = process.env.PORT || 3000;

const pool = new Pool({
    user: 'postgres',
    host: 'login-db.cnqwui85diru.us-east-1.rds.amazonaws.com',
    password: '12341234',
    port: 5432,
    ssl: { rejectUnauthorized: false }
});

app.use(bodyParser.json());

app.post('/login', async (req, res) => {
    const { correo, contraseña } = req.body;

    try {
        const result = await pool.query('SELECT * FROM usuario WHERE correo = $1 AND contraseña = $2', [correo, contraseña]);
        if (result.rows.length === 0) {
            return res.status(400).json({ message: 'Credenciales incorrectas' });
        }

        res.status(200).json({ message: 'Login exitoso' });
    } catch (error) {
        console.error('Error al realizar la consulta', error);
        res.status(500).json({ message: 'Error interno del servidor' });
    }
});

app.listen(PORT, () => {
    console.log(`Servidor escuchando en el puerto ${PORT}`);
});
