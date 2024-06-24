import { Pool } from "pg";

const pool = new Pool({
    host: process.env.DB_Host,
    user: process.env.DB_User,
    password: process.env.DB_PASSWORD,
    database: process.env.DB_DATABASE,
    ssl: true

});

async function queryDatabase(sql:string) {
    return pool.query(sql);
}