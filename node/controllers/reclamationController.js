
const asyncHandler = require('express-async-handler')
const Reclamation = require('../models/reclamation')


const addreclamation = asyncHandler(async (req, res) => {
    const { dateReclamation, user , description} = req.body

    const reclamation = await Reclamation.create(
        {
            dateReclamation: dateReclamation,
            user: user,
           description:description,
        }
    )
    console.log(reclamation)
    res.send(reclamation)
    })


const getAllreclamations = async (req, res) => {
    Reclamation.find({}, function (err, reclamation) {
        res.send(reclamation)
    });

}

const deleteReclamation = async (req, res) => {
    id = req.params.id; 
    console.log(id)
    Reclamation.findByIdAndDelete(id, (err, data) => {
        res.status(200).json({ message: 'Reclamation deleteed' })

    });
}

const updateReclamation = async (req, res, next) => {
    console.log(req.body)
    const updatedReclamation = await Reclamation.findByIdAndUpdate(req.params.id, req.body, {});

    res.status(200).json({
        status: 'success',
        data: {
            Reclamation: updatedReclamation,
        },
    });
};






module.exports = {
    addreclamation,
    getAllreclamations,
    deleteReclamation,
    updateReclamation
}