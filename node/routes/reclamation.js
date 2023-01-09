const express = require('express')
const router = express.Router()
const {
    addreclamation, getAllreclamations, deleteReclamation,updateReclamation
} = require('../controllers/reclamationController')

router.post('/add', addreclamation)
router.get('/', getAllreclamations)
router.delete('/:id', deleteReclamation)
router.put('/updateReclamation/:id', updateReclamation)


module.exports = router

